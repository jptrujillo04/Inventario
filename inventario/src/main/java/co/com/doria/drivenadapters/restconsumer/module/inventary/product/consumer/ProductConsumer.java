package co.com.doria.drivenadapters.restconsumer.module.inventary.product.consumer;

import co.com.doria.util.GoogleAuthorizeUtil;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.BatchGetValuesResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
@Component
public class ProductConsumer {

    @Value("${google.spreadSheets.id}")
    private String spreadsheet_id;

    private static final String APPLICATION_NAME = "Inventario";

    public static Sheets getSheetsService() throws IOException, GeneralSecurityException
    {
        System.out.println("Ingresa getSheetsService");
        Credential credential = GoogleAuthorizeUtil.authorize();
        System.out.println("Despues de credential");
        return new Sheets.Builder(
                GoogleNetHttpTransport.newTrustedTransport(),
                JacksonFactory.getDefaultInstance(), credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    public String getGoogleSheet() throws GeneralSecurityException, IOException {
        System.out.println("Ingresa getGoogleSheet");
        List<String> ranges = Arrays.asList("A1", "E1");
        var sheetAuth = getSheetsService();
        System.out.println("despues de getSheetsService");
        BatchGetValuesResponse readResult = sheetAuth.spreadsheets().values().batchGet(spreadsheet_id).setRanges(ranges).execute();
        System.out.println(readResult);
        return "String";
    }
}

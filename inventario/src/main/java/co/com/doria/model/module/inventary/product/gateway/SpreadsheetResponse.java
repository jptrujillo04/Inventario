package co.com.doria.model.module.inventary.product.gateway;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpreadsheetResponse {
    private String range;
    private String majorDimension;
    private List<String[]> values;
}

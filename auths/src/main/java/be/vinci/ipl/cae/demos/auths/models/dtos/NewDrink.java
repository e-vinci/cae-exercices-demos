package be.vinci.ipl.cae.demos.auths.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NewDrink {
    private String title;
    private String image;
    private double volume;
    private double price;
}
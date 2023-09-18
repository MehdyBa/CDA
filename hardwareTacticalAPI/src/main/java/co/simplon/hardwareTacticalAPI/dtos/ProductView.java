package co.simplon.hardwareTacticalAPI.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ProductView {
    String getId();

    String getName();

    String getDescription();

    String getImageURL();

    Long getSizeId();

    Long getCategoriesId();

    BigDecimal getPrice();

    LocalDate getCreatedAt();
}

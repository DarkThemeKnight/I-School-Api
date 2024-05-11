package demo.api.Data.Persistence.Api.constants;

import lombok.Getter;

@Getter
public enum GradeLetter {
    A_PLUS("A+"),
    A,
    A_MINUS("A-"),
    B_PLUS("B+"),
    B,
    B_MINUS("B-"),
    C_PLUS("C+"),
    C,
    C_MINUS("C-"),
    D_PLUS("D+"),
    D,
    D_MINUS("D-"),
    E,
    F;

    private final String symbol;

    GradeLetter(String symbol) {
        this.symbol = symbol;
    }

    GradeLetter() {
        this.symbol = name();
    }

}


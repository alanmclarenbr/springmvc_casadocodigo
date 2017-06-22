package br.com.casadocodigo.loja.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * Created by Alan on 22/06/2017.
 */
@Embeddable
public class Price {

    @Column(scale = 2)
    private BigDecimal value;
    private BookType bookType;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
}

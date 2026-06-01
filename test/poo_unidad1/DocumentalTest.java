package poo_unidad1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import uni1a.Documental;

public class DocumentalTest {

    @Test
    public void testTema() {

        Documental documental = new Documental(
                "Cosmos",
                45,
                "Science",
                "Astronomy"
        );

        assertEquals(
                "Astronomy",
                documental.getTema()
        );
    }
}


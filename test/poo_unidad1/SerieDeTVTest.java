package poo_unidad1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import uni1a.SerieDeTV;

public class SerieDeTVTest {

    @Test
    public void testTemporadas() {

        SerieDeTV serie = new SerieDeTV(
                "Game of Thrones",
                60,
                "Fantasy",
                8
        );

        assertEquals(8, serie.getTemporadas());
    }
}


////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testConvert() {
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("DI", IntegerToRoman.convert(501));
        assertEquals("DXLV", IntegerToRoman.convert(545));
        assertEquals("DXI", IntegerToRoman.convert(511));
        assertEquals("DXXXIX", IntegerToRoman.convert(539));
        assertEquals("DL", IntegerToRoman.convert(550));
        assertEquals("DXCIX", IntegerToRoman.convert(599));
        assertEquals("DC", IntegerToRoman.convert(600));
        assertEquals("DCL", IntegerToRoman.convert(650));
        assertEquals("DCXCIX", IntegerToRoman.convert(699));
        assertEquals("DCC", IntegerToRoman.convert(700));
        assertEquals("DCCL", IntegerToRoman.convert(750));
        assertEquals("DCCXCIX", IntegerToRoman.convert(799));
        assertEquals("DCCC", IntegerToRoman.convert(800));
        assertEquals("DCCCL", IntegerToRoman.convert(850));
        assertEquals("DCCCXCIX", IntegerToRoman.convert(899));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("CML", IntegerToRoman.convert(950));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        assertEquals("M", IntegerToRoman.convert(1000));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("Numero non valido", IntegerToRoman.convert(1001));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }


    /* Codice 500
    @Test
    public void testConvert500() {
        assertEquals("CI", IntegerToRoman.convert(101));
        assertEquals("CXI", IntegerToRoman.convert(111));
        assertEquals("CXXXIX", IntegerToRoman.convert(139));
        assertEquals("CXL", IntegerToRoman.convert(140));
        assertEquals("CL", IntegerToRoman.convert(150));
        assertEquals("CXCIX", IntegerToRoman.convert(199));
        assertEquals("CC", IntegerToRoman.convert(200));
        assertEquals("CCIV", IntegerToRoman.convert(204));
        assertEquals("CCV", IntegerToRoman.convert(205));
        assertEquals("CCL", IntegerToRoman.convert(250));
        assertEquals("CCXCIX", IntegerToRoman.convert(299));
        assertEquals("CCC", IntegerToRoman.convert(300));
        assertEquals("CCCL", IntegerToRoman.convert(350));
        assertEquals("CCCXCIX", IntegerToRoman.convert(399));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("CDL", IntegerToRoman.convert(450));
        assertEquals("CDXCIX", IntegerToRoman.convert(499));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("Numero non valido", IntegerToRoman.convert(501));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
    */

    /* Codice 100
    @Test
    public void testConvert() {
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("LI", IntegerToRoman.convert(51));
        assertEquals("LIV", IntegerToRoman.convert(54));
        assertEquals("LV", IntegerToRoman.convert(55));
        assertEquals("LIX", IntegerToRoman.convert(59));
        assertEquals("LXII", IntegerToRoman.convert(62));
        assertEquals("LXVII", IntegerToRoman.convert(67));
        assertEquals("LXIX", IntegerToRoman.convert(69));
        assertEquals("LXXIII", IntegerToRoman.convert(73));
        assertEquals("LXXIX", IntegerToRoman.convert(79));
        assertEquals("LXXX", IntegerToRoman.convert(80));
        assertEquals("LXXXIII", IntegerToRoman.convert(83));
        assertEquals("LXXXVII", IntegerToRoman.convert(87));
        assertEquals("LXXXIX", IntegerToRoman.convert(89));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCV", IntegerToRoman.convert(95));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("Numero non valido", IntegerToRoman.convert(101));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
    */

    /* Codice 50
    @Test
    public void testConvert() {
        assertEquals("XXI", IntegerToRoman.convert(21));
        assertEquals("XXIV", IntegerToRoman.convert(24));
        assertEquals("XXV", IntegerToRoman.convert(25));
        assertEquals("XXIX", IntegerToRoman.convert(29));
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("XXXIII", IntegerToRoman.convert(33));
        assertEquals("XXXV", IntegerToRoman.convert(35));
        assertEquals("XXXIX", IntegerToRoman.convert(39));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIV", IntegerToRoman.convert(44));
        assertEquals("XLV", IntegerToRoman.convert(45));
        assertEquals("XLIX", IntegerToRoman.convert(49));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("Numero non valido", IntegerToRoman.convert(51));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
    */

    /* Codice 20
    @Test
    public void testConvert() {
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XVI", IntegerToRoman.convert(16));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("Numero non valido", IntegerToRoman.convert(21));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
    */

    /* Codice 10
    @Test
    public void testConvert() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("Numero non valido", IntegerToRoman.convert(11));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
    */

    /* Codcie 6
    @Test
    public void testConvert() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
        assertEquals("Numero non valido", IntegerToRoman.convert(7));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
    */

    /* Codice 3
    @Test
    public void testConvert1() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("Numero non valido", IntegerToRoman.convert(4));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
    */
}


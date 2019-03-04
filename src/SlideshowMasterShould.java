import org.junit.Assert;
import org.junit.Test;

public class SlideshowMasterShould {
    private final static String a_example_filename = "data\\a_example.txt";
    private final static String b_lovely_landscapes_filename = "data\\b_lovely_landscapes.txt";
    private final static String c_memorable_moments_filename = "data\\c_memorable_moments.txt";
    private final static String d_pet_pictures_filename = "data\\d_pet_pictures.txt";
    private final static String example = "data\\example.txt";

    private SlideshowMaster master;

    @Test(expected = IllegalArgumentException.class)
    public void ThrowNullParameterExceptionIfFIlePathIsNull() {
        new SlideshowMaster(null);
    }

    @Test
    public void ReadExampleFile() {
        master = new SlideshowMaster(a_example_filename);
        Assert.assertEquals(4, master.getPhotosCount());
    }

    @Test
    public void ReadExampleFileAndReturnPhotos() {
        master = new SlideshowMaster(a_example_filename);
        Assert.assertEquals(2, master.getHorizontalsCount());
        Assert.assertEquals(2, master.getVerticalsCount());
    }
}

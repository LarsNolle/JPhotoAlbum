package fi.iki.jka;

import org.junit.Test;

import javax.swing.*;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: localuser
 * Date: 26/06/2012
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
public class SlideshowControlTest {
    @Test
    public void testShowSlideshowNoFiles() throws Exception {

        FakeMessageShower theFakeMessageShower = new FakeMessageShower();

        SlideshowControl control = new SlideshowControl();

        control.showSlideshow(new JPhotoFrame(), new JPhotoCollection(), new JList(), theFakeMessageShower);

        assertTrue(theFakeMessageShower.shown);

    }


    private class FakeMessageShower implements MessageShower {

        public boolean shown = false;

        public void ShowMessage(String message) {

            shown = true;


            //JOptionPane.showMessageDialog(JPhotoFrame.this, "No photos to show!",
            //        JPhotoFrame.APP_NAME, JOptionPane.ERROR_MESSAGE);
        }
    }


}

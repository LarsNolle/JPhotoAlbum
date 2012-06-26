package fi.iki.jka;

import javax.swing.*;

/**
* Created with IntelliJ IDEA.
* User: localuser
* Date: 26/06/2012
* Time: 15:48
* To change this template use File | Settings | File Templates.
*/
class SlideshowControl {

    public void showSlideshow(JPhotoFrame parentWindow, JPhotoCollection photos, JList list, MessageShower msgShower) {
        if (photos.getSize()>0) {
            JPhotoShow show = new JPhotoShow(photos, 5000, list);
            show.setVisible(true);
        }
        else
            msgShower.ShowMessage("No photos to show!");
//            JOptionPane.showMessageDialog(parentWindow, "No photos to show!",
//                    JPhotoFrame.APP_NAME, JOptionPane.ERROR_MESSAGE);
    }

}

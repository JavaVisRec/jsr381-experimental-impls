package visrec.impl.openimaj.examples;

import java.io.IOException;
import javax.visrec.detection.ObjectDetector;
import org.openimaj.image.MBFImage;

/**
 *
 * @author Zoran Sevarac <zoran.sevarac@deepnetts.com>
 */
public class VisRecFaceDetectorSample {

    public static void main(String[] args) throws IOException {

        ObjectDetector<MBFImage> faceDetector = new HaarCascadeFaceDetector();
//        faceDetector.setImageFactory(new MBFImageFactory()); // this should be automaticly losaded by detector based on the image class
//        ImageFactory<MBFImage> imageFactory = new MBFImageFactory();
//        MBFImage image = imageFactory.getImage(new File("people.jpg"));

//        ClassificationResults results = faceDetector.detectObject(new File("people.jpg"));
//
//        for(Object result : results.getTopKResults(5)) {
//            System.out.println( ((DetectedFace)result).getBounds());
//        }
        // we need to allow detectors recognizers and annotators to get input directly from file, url or stream. Maybe some ImageConsumerInterface ?
        // we dont want to make people to dig deep into our api and understand internal classes in order to be able to use it (thats most important thing)
        // visual recognition api for mainstream java developer that does not know anything about imaging details or machine learning - make this technlogy available to masses
    }

}

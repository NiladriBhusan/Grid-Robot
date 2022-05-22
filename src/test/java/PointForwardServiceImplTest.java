import com.idealo.entity.Point;
import com.idealo.enums.FaceValue;
import com.idealo.service.PointForwardService;
import com.idealo.service.impl.PointForwardServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class PointForwardServiceImplTest {
    @Test
    public void testForward(){
        PointForwardService pointForwardService = new PointForwardServiceImpl();
        Point currentPoint = new Point(1,1);
        int steps =2;
        FaceValue faceValue = FaceValue.EAST;

        Point expected = new Point(3,1);
        Point found= pointForwardService.forward(currentPoint,steps,faceValue);
        Assert.assertEquals( found.getCoordinateX(),expected.getCoordinateX());
        Assert.assertEquals(found.getCoordinateY(),expected.getCoordinateY());
    }
}

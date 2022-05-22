import com.idealo.enums.FaceValue;
import com.idealo.service.impl.TurnAroundServiceImpl;
import com.idealo.service.impl.TurnRightServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class TurnAroundServiceImplTest {
    @Test
    public void testTurnAroundForFaceValueNorth(){
        TurnAroundServiceImpl turnAroundService = new TurnAroundServiceImpl();
        FaceValue expected = FaceValue.SOUTH;
        FaceValue found = turnAroundService.turnaround(FaceValue.NORTH);
        Assert.assertEquals(found,expected);
    }
    @Test
    public void testTurnaroundForFaceValueEAST(){
        TurnAroundServiceImpl turnAroundService = new TurnAroundServiceImpl();
        FaceValue expected = FaceValue.WEST;
        FaceValue found = turnAroundService.turnaround(FaceValue.EAST);
        Assert.assertEquals(found,expected);
    }
    @Test
    public void testTurnaroundForFaceValueSOUTH(){
        TurnAroundServiceImpl turnaroundService = new TurnAroundServiceImpl();
        FaceValue expected = FaceValue.NORTH;
        FaceValue found = turnaroundService.turnaround(FaceValue.SOUTH);
        Assert.assertEquals(found,expected);
    }
    @Test
    public void testTurnaroundForFaceValueWEST(){
        TurnAroundServiceImpl turnaroundService = new TurnAroundServiceImpl();
        FaceValue expected = FaceValue.EAST;
        FaceValue found = turnaroundService.turnaround(FaceValue.WEST);
        Assert.assertEquals(found,expected);
    }
}

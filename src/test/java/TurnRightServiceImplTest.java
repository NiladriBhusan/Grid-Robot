import com.idealo.enums.FaceValue;
import com.idealo.service.impl.TurnRightServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class TurnRightServiceImplTest {
    @Test
    public void testTurnRightForFaceValueNorth(){
        TurnRightServiceImpl turnRightService = new TurnRightServiceImpl();
        FaceValue expected = FaceValue.EAST;
        FaceValue found = turnRightService.turnRight(FaceValue.NORTH);
        Assert.assertEquals(found,expected);
    }
    @Test
    public void testTurnRightForFaceValueEAST(){
        TurnRightServiceImpl turnRightService = new TurnRightServiceImpl();
        FaceValue expected = FaceValue.SOUTH;
        FaceValue found = turnRightService.turnRight(FaceValue.EAST);
        Assert.assertEquals(found,expected);
    }
    @Test
    public void testTurnRightForFaceValueSOUTH(){
        TurnRightServiceImpl turnRightService = new TurnRightServiceImpl();
        FaceValue expected = FaceValue.WEST;
        FaceValue found = turnRightService.turnRight(FaceValue.SOUTH);
        Assert.assertEquals(found,expected);
    }
    @Test
    public void testTurnRightForFaceValueWEST(){
        TurnRightServiceImpl turnRightService = new TurnRightServiceImpl();
        FaceValue expected = FaceValue.NORTH;
        FaceValue found = turnRightService.turnRight(FaceValue.WEST);
        Assert.assertEquals(found,expected);
    }
}

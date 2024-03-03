import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/calc.csv")
    public void testRegistredUnderLimit(int expected, int income, int expenses, int threshold) {
     CalcService service = new CalcService();
        int result = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, result);

    }
}
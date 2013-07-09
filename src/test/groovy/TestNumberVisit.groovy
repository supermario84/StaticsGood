import componentStatistics.Days
import componentStatistics.NumberPages
import componentStatistics.NumberVisits
import org.junit.Test
/**
 * Created with IntelliJ IDEA.
 * User: mario
 * Date: 06/07/13
 * Time: 11.12
 * To change this template use File | Settings | File Templates.
 */
class TestNumberVisit {

    @Test
    public void verifyNumberVisit() throws InterruptedException {

        Days day= new Days()
        NumberVisits numberVisits = new NumberVisits();
        NumberPages numberPages = new NumberPages();
        File file = new File("src/main/resources/doc.txt")
        process.Process p = new process.Process(numberVisits,numberPages,day);
        p.extractElements(file);
        def arrayVisit = numberVisits.getNumberVisit()
        junit.framework.Assert.assertEquals(arrayVisit.size(),31);

    }
}

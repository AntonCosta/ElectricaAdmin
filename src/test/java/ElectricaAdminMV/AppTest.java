package ElectricaAdminMV;

import ElectricaAdminMV.controller.ClientController;
import ElectricaAdminMV.model.Client;
import junit.framework.TestCase;
import org.junit.Test;


public class AppTest 
    extends TestCase
{
    @Test
    public void testAllRequirements() throws Exception{
        ClientController clnt = new ClientController();
        Client clt = new Client("Asd","asd","12");
        clnt.AddClient("Asd","asd","12");
        clnt.AddClientIndex(clt,10,10,10);
        assertEquals("Monthly index already exists!",clnt.AddClientIndex(clt,10,10,10));
        clnt.AddClientIndex(clt,20,10,10);
        assertEquals("Year: 10, Month: 10, Penalty: 10\nYear: 10, Month: 10, Penalty: 10\nYear: 20, Month: 10, Penalty: 10\n", clnt.ListIssue(clt));
    }



}

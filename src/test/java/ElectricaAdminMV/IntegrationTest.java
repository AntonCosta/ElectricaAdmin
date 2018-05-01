package ElectricaAdminMV;

import ElectricaAdminMV.controller.ClientController;
import ElectricaAdminMV.model.Client;
import junit.framework.TestCase;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Costa on 29/04/2018.
 */
public class IntegrationTest extends TestCase {

    @Test
    public void testFirstRequirement() throws Exception{

        ClientController clnt = new ClientController();
        assertEquals(null, clnt.AddClient("Ali","asd","1"));
        Client clt = new Client("Asd","asd","1");
        assertEquals("Client already exists!", clnt.AddClient("Ali","asd","1"));

    }

    @Test
    public void testFirstTwoRequirements() throws Exception{
        ClientController clnt = new ClientController();
        assertEquals(null, clnt.AddClient("Ali","asd","1"));
        Client clt = new Client("Asd","asd","1");
        assertEquals("Client already exists!", clnt.AddClient("Ali","asd","1"));
        clnt.AddClientIndex(clt,10,10,10);
        assertEquals("Monthly index already exists!",clnt.AddClientIndex(clt,10,10,10));
        Client clt2 = new Client("Asd","asd","100");
        assertEquals("Client does not exist!",clnt.AddClientIndex(clt2,10,10,10));

    }

    @Test
    public void testAllThreeRequirements() throws Exception{
        ClientController clnt = new ClientController();
        assertEquals(null, clnt.AddClient("Ali","asd","1"));
        Client clt = new Client("Asd","asd","1");
        assertEquals("Client already exists!", clnt.AddClient("Ali","asd","1"));
        clnt.AddClientIndex(clt,10,10,10);
        assertEquals("Monthly index already exists!",clnt.AddClientIndex(clt,10,10,10));
        Client clt2 = new Client("Asd","asd","100");
        assertEquals("Client does not exist!",clnt.AddClientIndex(clt2,10,10,10));
        assertEquals("Year: 10, Month: 10, Penalty: 10\n", clnt.ListIssue(clt));


    }




}

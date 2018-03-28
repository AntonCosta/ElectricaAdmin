package ElectricaAdminMV.controller;

import ElectricaAdminMV.model.Client;
import junit.framework.TestCase;

/**
 * Created by Costa on 28/03/2018.
 */
public class ClientControllerTest extends TestCase {

    @org.junit.Test
    public void testAddClientIndexIfs() throws Exception {
        ClientController clnt = new ClientController();
        Client clt = new Client();
        assertEquals("Year can't be 0 or less!", clnt.AddClientIndex(clt,-1,10,10));
        assertEquals("Month can't be 0 or less!", clnt.AddClientIndex(clt,10,-1,10));
        assertEquals("Money to pay can't be less than 0!", clnt.AddClientIndex(clt,10,10,-1));
        assertEquals("Name or address cannot be empty!",clnt.AddClientIndex(clt,10,10,10));
    }

    @org.junit.Test
    public void testAddClientIndex() throws Exception{
        ClientController clnt = new ClientController();
        Client clt = new Client("Asd","asd","12");
        assertEquals("Client does not exist!",clnt.AddClientIndex(clt,10,10,10));
    }


}
package ElectricaAdminMV.controller;

import ElectricaAdminMV.model.Client;
import junit.framework.TestCase;
import org.junit.Test;


public class ClientControllerTest extends TestCase {


    // cerinta a

    @Test
    public void testAddValidClient() throws Exception{
        ClientController clnt = new ClientController();
        assertEquals(null, clnt.AddClient("Ali","asd","1"));
    }

    @Test
    public void testAddExistingClient() throws Exception{
        ClientController clnt = new ClientController();
        assertEquals(null, clnt.AddClient("Ali","asd","1"));
        assertEquals("Client already exists!", clnt.AddClient("Ali","asd","1"));
    }

    @Test
    public void testAddClientNoId() throws Exception{
        ClientController clnt = new ClientController();
        assertEquals("Id cannot be empty!", clnt.AddClient("Ali","asd",""));
    }


    @Test
    public void testAddClientNoName() throws Exception{
        ClientController clnt = new ClientController();
        assertEquals("Name or address cannot be empty!", clnt.AddClient("","asd","1"));
    }

    @Test
    public void testAddClientNoAddress() throws Exception{
        ClientController clnt = new ClientController();
        assertEquals("Name or address cannot be empty!", clnt.AddClient("Ali","","1"));
    }



    // cerinta b

    @Test
    public void testAddClientIndexInvalidYear() throws Exception {
        ClientController clnt = new ClientController();
        Client clt = new Client();
        assertEquals("Year can't be 0 or less!", clnt.AddClientIndex(clt,-1,10,10));
        assertEquals("Month can't be 0 or less!", clnt.AddClientIndex(clt,10,-1,10));
        assertEquals("Money to pay can't be less than 0!", clnt.AddClientIndex(clt,10,10,-1));
        assertEquals("Id cannot be empty!",clnt.AddClientIndex(clt,10,10,10));
    }

    @Test
    public void testAddClientIndexInvalidMonth() throws Exception {
        ClientController clnt = new ClientController();
        Client clt = new Client();
        assertEquals("Month can't be 0 or less!", clnt.AddClientIndex(clt,10,-1,10));

    }

    @Test
    public void testAddClientIndexEmptyId() throws Exception {
        ClientController clnt = new ClientController();
        Client clt = new Client();
        assertEquals("Id cannot be empty!",clnt.AddClientIndex(clt,10,10,10));

    }

    @Test
    public void testAddClientIndexNegativeMoney() throws Exception {
        ClientController clnt = new ClientController();
        Client clt = new Client();
        assertEquals("Money to pay can't be less than 0!", clnt.AddClientIndex(clt,10,10,-1));

    }


    @org.junit.Test
    public void testAddClientIndexInexistentClient() throws Exception{
        ClientController clnt = new ClientController();
        Client clt = new Client("Asd","asd","12");
        assertEquals("Client does not exist!",clnt.AddClientIndex(clt,10,10,10));
    }

    @Test
    public void testAddClientIndexAlreadyExistent() throws Exception{
        ClientController clnt = new ClientController();
        Client clt = new Client("Asd","asd","12");
        clnt.AddClient("Asd","asd","12");
        clnt.AddClientIndex(clt,10,10,10);
        assertEquals("Monthly index already exists!",clnt.AddClientIndex(clt,10,10,10));
    }

    @Test
    public void testAddClientIndexValid() throws Exception{
        ClientController clnt = new ClientController();
        Client clt = new Client("Asd","asd","12");
        clnt.AddClient("Asd","asd","12");
        assertEquals(null,clnt.AddClientIndex(clt,10,10,10));
    }





}
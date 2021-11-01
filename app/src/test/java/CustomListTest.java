import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    static CustomList list;
    @Before
    public void setup(){
        list= new CustomList(null,new ArrayList<City>());

    }
    @Test
    public void addCityTest(){
        City c=new City("Edmonton","AB");
        int size =list.getCount();
        list.addCity(c);
        assertEquals(size+1,list.getCount());

    }
    @Test
    public void testhasCity() {

        City city = new City("Edmonton","AB");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));

    }
    @Test
    public void testdeleteCity() {

        City city = new City("Edmonton","AB");
        list.addCity(city);
        list.deleteCity(city);

        assertEquals(0, list.getCount());

    }
    @Test
    public void testcountCity() {

        City city = new City("Edmonton","AB");
        list.addCity(city);


        assertEquals(1, list.getCount());

    }

}

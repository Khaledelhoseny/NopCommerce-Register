package readFile;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import data.DataModeling;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDataFromJson {

    public DataModeling readJsonData() throws FileNotFoundException {

        FileReader fileReader = new FileReader("data/data.json") ;
        JsonReader reader = new JsonReader(fileReader);
        Gson gson = new Gson() ;
        DataModeling data = gson.fromJson(reader, DataModeling.class);
        return data ;

    }
}

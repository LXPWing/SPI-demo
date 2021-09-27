import com.Li.DataSaveService;

import java.util.ServiceLoader;

/**
 * @author : xingpeng
 * @date : 2021-09-27 09:55
 **/
public class MainTest {
    public static void main(String[] args) {
        ServiceLoader<DataSaveService> dataSaveServices = ServiceLoader.load(DataSaveService.class);

        for(DataSaveService dataSaveService: dataSaveServices){
            dataSaveService.saveData();
        }
    }
}

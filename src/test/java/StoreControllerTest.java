import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import com.alfarosoft.peoplelist.service.StoreService;

@SpringBootTest
@AutoConfigureMockMvc
public class StoreControllerTest {
    @MockBean
    private StoreService storeService;

    @Autowired
    private MockMvc mvc;
}

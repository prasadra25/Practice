package blackpearl.project.devibeerservice.web.contraoller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(BeerController.class)
class BeerControllerTest {

  @Autowired
  MockMvc mockmvc;


    @Test
    void getBeerById() {

    }
    @Test
    void saveNewBeer() {
    }

    @Test
    void updateBeerById() {
    }
}

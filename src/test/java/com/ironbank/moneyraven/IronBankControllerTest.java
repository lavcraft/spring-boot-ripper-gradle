package com.ironbank.moneyraven;

import com.ironbank.moneyraven.service.ProphetService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author tolkv
 * @since 8/20/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class IronBankControllerTest {
  @Autowired
  MockMvc mockMvc;
  @MockBean
  ProphetService prophetService;

  @Before
  public void before() {
    when(prophetService.willSurvive(anyString()))
        .thenReturn(true);
  }

  @Test
  public void should_credit() throws Exception {
    mockMvc.perform(get("/credit?name=Rob&amount=10"))
        .andExpect(status().isOk());

    mockMvc.perform(get("/state"))
        .andExpect(status().isOk())
        .andExpect(content().string("100490"))
        .andReturn();
  }
}

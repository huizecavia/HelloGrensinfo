package org.matthijs.huizecavia.grensinfo_azure;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class GrensinfoAzureApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void getRestControllerMessage() throws Exception {
		this.mockMvc.perform(get("/api/hej")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hej! Välkommen till Gränsinfo")));
	}

	@Test
	void getControllerMessage() throws Exception {
		this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("koffie.jpg")));
	}

	@Test
	void contextLoads() {
	}

}

package com.controller;

/**
 * @Author ll
 * @Date 2018/10/8 11:32
 */

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mvc.xml"})
public class TestMyBatis {
   /* @Autowired
    private UserService userService;

    @Test
    public void test1(){
        Long id=Long.valueOf("1");
        User user = userService.queryUserByID(id);
        System.out.println(user.toString());
    }*/
    private MockMvc mockMvc;

    @Resource
    private UserController userController;

    @Before
    public void setUp() throws  Exception{
        mockMvc=MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void testIndex() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/queryUser")).andReturn();
        System.out.println(mvcResult.getResponse());
    }

}

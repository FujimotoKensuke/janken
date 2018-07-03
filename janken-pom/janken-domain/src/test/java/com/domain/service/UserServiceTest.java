/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.service;

import com.domain.form.UserCreateForm;
import com.domain.model.UserModel;
import com.domain.model.UserModelFactory;
import com.domain.repository.UserInfoRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.util.ReflectionTestUtils;

/**
 *
 * @author k_fujimoto
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class UserServiceTest {

    private UserService userService;

    @Mock
    private UserInfoRepository userInfoRepository;

    public UserServiceTest() {
    }

    @Before
    public void setUp() {
        userService = new UserServiceImpl();
        // RepositoryをMock化
        ReflectionTestUtils.setField(userService, "userInfoRepository", userInfoRepository);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class UserService.
     */
    @Test
    public void testCreate_正常系() {
        // データ準備
        UserCreateForm form = new UserCreateForm();
        form.setUserId("userId");
        form.setUserName("userName");
        form.setComment("comment");
        UserModel model = UserModelFactory.create(form);

        // 実行
        userService.create(model);

        // 確認
        verify(userInfoRepository, times(1)).insertUser(model);
    }

    /**
     * Test of getUserList method, of class UserService.
     */
    @Test
    public void testGetUserList() {
    }

}

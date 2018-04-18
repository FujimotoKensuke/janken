package com.web.controller;

import com.domain.form.UserCreateForm;
import com.domain.model.UserModel;
import com.domain.model.UserModelFactory;
import com.domain.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ユーザー情報関連コントローラ
 *
 * @author k_fujimoto
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * ユーザー情報登録(初期表示)API
     */
    @RequestMapping(value = "/userCreate", params = "init", method = RequestMethod.POST)
    public String userCreateInit(@ModelAttribute UserCreateForm form, Model model) {
        return "userCreate"; // 使用するテンプレートの名前を指定する
    }

    /**
     * ユーザー情報登録(登録実行)API
     */
    @RequestMapping(value = "/userCreate", params = "enter", method = RequestMethod.POST)
    public String userCreateDone(@Validated @ModelAttribute UserCreateForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("validationError", "不正な値が入力されました。");
            return userCreateInit(form, model);
        }
        userService.create(UserModelFactory.create(form));

        model.addAttribute("message", "ユーザーの新規登録が完了しました。");   // パラメタを渡す
        return "userCreate"; // 使用するテンプレートの名前を指定する
    }

    /**
     * ユーザー情報取得API
     */
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String getUserList(Model model) {

        final List<UserModel> userModelList = userService.getUserList();
        model.addAttribute("userModelList", userModelList);   // パラメタを渡す
        return "userList"; // 使用するテンプレートの名前を指定する
    }
}

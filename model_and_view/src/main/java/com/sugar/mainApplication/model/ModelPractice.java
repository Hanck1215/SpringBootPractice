package com.sugar.mainApplication.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelPractice {
	@GetMapping("/showViewPage") //這是Spring框架的注解，表示這個方法處理來自/showViewPage路徑的GET請求。當用戶訪問該路徑時，這個方法將被調用。
	public String passParametersWithModel(Model model) { //這個方法的參數是一個Model物件。Model是Spring框架提供的一個介面，它用於傳遞數據到視圖中，以便在用戶界面上顯示。這裡我們將使用Model物件來傳遞資料給視圖。
	    Map<String, String> map = new HashMap<>(); //Map<String, String> map = new HashMap<>();: 創建了一個名為map的HashMap物件，用於存儲鍵值對。
	    map.put("spring", "mvc"); //map.put("spring", "mvc");: 向map中添加了一個鍵值對，鍵為"spring"，值為"mvc"。
	    model.addAttribute("message", "Baeldung"); // model.addAttribute("message", "Baeldung");: 使用model的addAttribute()方法，將一個名為"message"的屬性添加到model中，它的值為"Baeldung"。這個"message"屬性將被傳遞到視圖。
	    model.mergeAttributes(map); //model.mergeAttributes(map);: 使用model的mergeAttributes()方法，將之前創建的map中的所有鍵值對合併到model中。這樣，model中將包含"spring"這個鍵值對，值為"mvc"。
	    return "view/viewPage"; //return "view/viewPage";: 最後，這個方法返回一個名為"view/viewPage"的字符串。這表示在處理請求後，將返回viewPage.html視圖給用戶。在這個視圖中，可以使用${message}和${spring}來訪問model中的屬性，顯示"Baeldung"和"mvc"這兩個值。
	}
}

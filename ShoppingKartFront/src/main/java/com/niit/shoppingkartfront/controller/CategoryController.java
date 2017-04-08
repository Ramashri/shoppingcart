package com.niit.shoppingkartfront.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.ShoppingCartBackend.DAO.CategoryDAO;
import com.niit.ShoppingCartBackend.Model.Category;


@Controller
public class CategoryController {
	
		@Autowired
		private CategoryDAO categoryDAO;
		
		@RequestMapping("addCategory")
		public String addCategory(@ModelAttribute Category category, Model model){
			categoryDAO.saveOrUpdate(category);
			
			return "redirect:viewCategory";
		
		}
		@RequestMapping("viewCategory")
		public String ViewCategory(Model model){
			List<Category> categoryList = categoryDAO.list();
			model.addAttribute("categoryList", categoryList);
			model.addAttribute("ViewCategoryButtonClicked", true);
			return "AdminLogin";
		}
		@RequestMapping("deleteCategory")
		public String deleteCategory(@RequestParam ("categoryId") int categoryId){
			
			categoryDAO.delete(categoryId);
			
			return "redirect:viewCategory";
						
		}
		@RequestMapping("editCategory")
		public String editCategory(@RequestParam ("categoryId") int categoryId, Model model){
			Category category = categoryDAO.getByCategoryId(categoryId);
			model.addAttribute("category", category);
			model.addAttribute("editCategoryClicked", true);
			return "AdminLogin";
			
		}
		@RequestMapping("categoryEdited")
		public String categoryEdited(@ModelAttribute Category category){
			
			categoryDAO.saveOrUpdate(category);
			return "redirect:viewCategory";
		}
	}

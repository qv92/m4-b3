package controller;


import model.Food;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.FoodService;

@Controller
public class FoodController {
    private FoodService foodService = new FoodService();
    @GetMapping("/")
    public ModelAndView getHome() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("listFood", foodService.list);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        return new ModelAndView("create");
    }

    @GetMapping("/edit")
    public ModelAndView showEdit(@RequestParam int index) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("food", foodService.list.get(index));
        return modelAndView;
    }

    @GetMapping("/delete")
    public ModelAndView delete(@RequestParam int index) {
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        foodService.delete(index);
        return modelAndView;
    }

    @GetMapping("/find")
    public ModelAndView find(@RequestParam String fName) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("listFood", foodService.find(fName));
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute Food food) {
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        foodService.save(food);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView edit(@RequestParam int index, @ModelAttribute Food food) {
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        foodService.edit(index, food);
        return modelAndView;
    }
}

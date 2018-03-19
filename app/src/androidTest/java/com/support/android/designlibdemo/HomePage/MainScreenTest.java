package com.support.android.designlibdemo.HomePage;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.support.android.designlibdemo.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.RecyclerViewActions.scrollToPosition;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isSelected;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.core.IsNot.not;
import static com.support.android.designlibdemo.HomePage.MainScreenPage.*;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainScreenTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateApplicationBarItems() {
        sideMenu.check(matches(allOf(isDisplayed(), isClickable())));
        cheesesquare.check(matches(isDisplayed()));
        moreOptionsButton.check(matches(allOf(isDisplayed(), isClickable())));

    }

    @Test
    public void validateCatergoriesMenuDefault() {
        catergory1.check(matches(allOf(isDisplayed(), isSelected())));
        catergory2.check(matches(allOf(isDisplayed(), not(isSelected()))));
        catergory3.check(matches(allOf(isDisplayed(), not(isSelected()))));
    }

    @Test
    public void validateCategoryChange() {
        catergory2.perform(click());
        catergory2.check(matches(isSelected()));
        catergory1.check(matches(not(isSelected())));
        catergory3.check(matches(not(isSelected())));
        catergory3.perform(click());
        catergory3.check(matches(isSelected()));
        catergory1.check(matches(not(isSelected())));
        catergory2.check(matches(not(isSelected())));
    }

    @Test
    public void validateCategorySwipe() {
        cheesList.perform(swipeLeft());
        catergory2.check(matches(isSelected()));
        catergory1.check(matches(not(isSelected())));
        catergory3.check(matches(not(isSelected())));
        cheesList.perform(swipeLeft());
        catergory3.check(matches(isSelected()));
        catergory1.check(matches(not(isSelected())));
        catergory2.check(matches(not(isSelected())));
    }

    @Test
    public void validateCategorieListIsScrollable() {
        cheesListRecycleView.perform(scrollToPosition(25));

    }
}

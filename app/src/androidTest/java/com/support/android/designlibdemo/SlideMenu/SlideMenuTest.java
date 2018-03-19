package com.support.android.designlibdemo.SlideMenu;

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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;
import static com.support.android.designlibdemo.SlideMenu.SlideMenuPage.*;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SlideMenuTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateSideMenuIsDisplayedWhenOpened() {
        sideMenuButton.check(matches(isDisplayed())).perform(click());
        swipeMenu.check(matches(isDisplayed())).perform(swipeLeft());
        swipeMenu.check(matches(not(isDisplayed())));
    }

    @Test
    public void validateSwipeMenuHeader() {
        sideMenuButton.perform(click());
        userName.check(matches(withText("Username")));
    }

    @Test
    public void validateSwipeMenuEntries() {
        sideMenuButton.check(matches(isDisplayed())).perform(click());
        home.check(matches(withText("Home")));
        messages.check(matches(withText("Messages")));
        friends.check(matches(withText("Friends")));
        discussions.check(matches(withText("Discussion")));
        subItems.check(matches(withText("Sub items")));
        subItem1.check(matches(withText("Sub item 1")));
        subItem2.check(matches(withText("Sub item 2")));

    }

    @Test
    public void validateMenuEntriesCanBeSelected() {
        sideMenuButton.perform(click());
        subItem1.perform(click());
        sideMenuButton.perform(click());
        subItem1.check(matches(withText("Sub item 1"))).check(matches(isEnabled()));
    }
}

package com.support.android.designlibdemo.AppMenu;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import com.support.android.designlibdemo.MainActivity;
import com.support.android.designlibdemo.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.withChild;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.support.android.designlibdemo.support.BaseElementsIds.*;
import static org.hamcrest.Matchers.allOf;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class NightModeTest {
    ViewInteraction applicationMenu = onView(allOf(withContentDescription("More options"), isDescendantOfA(withId(APP_BAR))));
    ViewInteraction nightModeMenu = onView(allOf(withId(R.id.submenuarrow)));
    ViewInteraction nightModeSelection = onView(allOf(withChild(withText("Night (always)"))));

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateCanChangeToNightMode(){
        applicationMenu.perform(click());
        nightModeMenu.perform(click());
        nightModeSelection.perform(click());

    }
}

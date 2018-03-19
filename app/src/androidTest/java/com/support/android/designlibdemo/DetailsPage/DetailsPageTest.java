package com.support.android.designlibdemo.DetailsPage;

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
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.support.android.designlibdemo.DetailsPage.DetailsPage.*;
import static com.support.android.designlibdemo.support.CustomMatcher.withIndex;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)

public class DetailsPageTest {


    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateDetailsPageBackButton() {
        ViewInteraction cheesListRecycleView = onView(allOf(withIndex(withId(R.id.recyclerview), 0)));
        cheesListRecycleView.perform(click());
        moreOptionsButton.perform(click());
        pressBack();
        backButton.perform(click());
    }

    @Test
    public void validateDetailsPageInfo(){
        ViewInteraction cheesListRecycleView = onView(allOf(withIndex(withId(R.id.recyclerview), 0)));
        cheesListRecycleView.perform(click());
        info.check(matches(hasDescendant(withText("Info"))));
    }

    @Test
    public void validateDetailsPageFriends() {
        ViewInteraction cheesListRecycleView = onView(allOf(withIndex(withId(R.id.recyclerview), 0)));
        cheesListRecycleView.perform(click());
        friends.check(matches(hasDescendant(withText("Friends"))));

    }

    @Test
    public void validateDetailsPageRelated() {
        ViewInteraction cheesListRecycleView = onView(allOf(withIndex(withId(R.id.recyclerview), 0)));
        cheesListRecycleView.perform(click());
        info.perform(swipeUp());
        related.check(matches(hasDescendant(withText("Related"))));
    }
}

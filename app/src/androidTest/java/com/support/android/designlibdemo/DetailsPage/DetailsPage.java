package com.support.android.designlibdemo.DetailsPage;


import android.support.test.espresso.ViewInteraction;

import com.support.android.designlibdemo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.support.android.designlibdemo.support.CustomMatcher.withIndex;
import static com.support.android.designlibdemo.support.BaseElementsIds.MENU_BAR;
import static org.hamcrest.Matchers.allOf;

public class DetailsPage {
    public static final ViewInteraction cheesListRecycleView = onView(allOf(withIndex(withId(R.id.recyclerview), 0)));
    public static final ViewInteraction backButton = onView(allOf(withContentDescription("Navigate up"), isDescendantOfA(withId(MENU_BAR))));
    public static final ViewInteraction moreOptionsButton = onView(allOf(withContentDescription("More options"), isDescendantOfA(withId(MENU_BAR))));
    public static final ViewInteraction info = onView(allOf(withId(R.id.info)));
    public static final ViewInteraction friends = onView(allOf(withId(R.id.friends)));
    public static final ViewInteraction related = onView(allOf(withId(R.id.related)));
}

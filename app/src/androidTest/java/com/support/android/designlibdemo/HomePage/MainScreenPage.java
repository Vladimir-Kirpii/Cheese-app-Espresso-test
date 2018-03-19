package com.support.android.designlibdemo.HomePage;


import android.support.test.espresso.ViewInteraction;

import com.support.android.designlibdemo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.withChild;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.support.android.designlibdemo.support.CustomMatcher.withIndex;
import static com.support.android.designlibdemo.support.BaseElementsIds.CHEES_LIST;
import static com.support.android.designlibdemo.support.BaseElementsIds.MENU_BAR;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class MainScreenPage {
    public static ViewInteraction catergory1 = onView(allOf(withClassName(endsWith("TabView")), withChild(withText("Category 1"))));
    public static ViewInteraction catergory2 = onView(allOf(withClassName(endsWith("TabView")), withChild(withText("Category 2"))));
    public static ViewInteraction catergory3 = onView(allOf(withClassName(endsWith("TabView")), withChild(withText("Category 3"))));
    public static ViewInteraction cheesList = onView(allOf(withId(CHEES_LIST)));
    public static ViewInteraction cheesListRecycleView = onView(allOf(withIndex(withId(R.id.recyclerview), 0)));
    public static ViewInteraction moreOptionsButton = onView(allOf(withContentDescription("More options"), isDescendantOfA(withId(MENU_BAR))));
    public static ViewInteraction cheesesquare  = onView(allOf(withText("Cheesesquare"), isDescendantOfA(withId(MENU_BAR))));
    public static ViewInteraction sideMenu = onView(allOf(withContentDescription("Navigate up"), isDescendantOfA(withId(MENU_BAR))));

}

package com.support.android.designlibdemo.SlideMenu;


import android.support.test.espresso.ViewInteraction;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.support.android.designlibdemo.support.BaseElementsIds.APP_BAR;
import static com.support.android.designlibdemo.support.BaseElementsIds.SWIPE_MENU_HEADER;
import static com.support.android.designlibdemo.support.BaseElementsIds.SWIPE_MENU_MAIN;
import static org.hamcrest.Matchers.allOf;

public class SlideMenuPage {
    public static ViewInteraction sideMenuButton = onView(allOf(withContentDescription("Navigate up"), isDescendantOfA(withId(APP_BAR))));
    public static ViewInteraction swipeMenu = onView(allOf(withId(SWIPE_MENU_MAIN)));
    public static ViewInteraction userName = onView(allOf(isDescendantOfA(withId(SWIPE_MENU_HEADER)),withText("Username")));
    public static ViewInteraction home  = onView(allOf(isDescendantOfA(withId(SWIPE_MENU_MAIN)),withText("Home")));
    public static ViewInteraction messages  = onView(allOf(isDescendantOfA(withId(SWIPE_MENU_MAIN)),withText("Messages")));
    public static ViewInteraction friends  = onView(allOf(isDescendantOfA(withId(SWIPE_MENU_MAIN)),withText("Friends")));
    public static ViewInteraction discussions  = onView(allOf(isDescendantOfA(withId(SWIPE_MENU_MAIN)),withText("Discussion")));
    public static ViewInteraction subItems = onView(allOf(isDescendantOfA(withId(SWIPE_MENU_MAIN)),withText("Sub items")));
    public static ViewInteraction subItem1 = onView(allOf(isDescendantOfA(withId(SWIPE_MENU_MAIN)),withText("Sub item 1")));
    public static ViewInteraction subItem2 = onView(allOf(isDescendantOfA(withId(SWIPE_MENU_MAIN)),withText("Sub item 2")));


}

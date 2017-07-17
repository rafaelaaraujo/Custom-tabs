package com.example.rafaelaaraujo.customTabAndroid;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.rafaelaaraujo.customTab.activity.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

/**
 * Created by rafaela.araujo on 17/11/2016.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity;

    @Before
    public void setActivity() {
        mainActivity = mActivityRule.getActivity();
    }

    @Test
    public void testSwipeView(){
        onView(allOf(withId(R.id.viewpager), isDisplayed())).perform(swipeLeft());
        onView(allOf(withId(R.id.due_date), isDisplayed())).check(matches(withText("VENCIMENTO EM 20 MAI")));

    }

    @Test
    public void testClickView(){
        onView(allOf(withId(R.id.title_tab), withText("ABR 15"))).perform(click());
        onView(allOf(withId(R.id.due_date), isDisplayed())).check(matches(withText("VENCIMENTO EM 20 ABR")));
    }


}

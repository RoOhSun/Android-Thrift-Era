// Generated by view binder compiler. Do not edit!
package com.example.kelineyt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.kelineyt.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout homeHeader;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final ViewPager2 viewpagerHome;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout homeHeader,
      @NonNull TabLayout tabLayout, @NonNull ViewPager2 viewpagerHome) {
    this.rootView = rootView;
    this.homeHeader = homeHeader;
    this.tabLayout = tabLayout;
    this.viewpagerHome = viewpagerHome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.homeHeader;
      LinearLayout homeHeader = ViewBindings.findChildViewById(rootView, id);
      if (homeHeader == null) {
        break missingId;
      }

      id = R.id.tabLayout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.viewpagerHome;
      ViewPager2 viewpagerHome = ViewBindings.findChildViewById(rootView, id);
      if (viewpagerHome == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, homeHeader, tabLayout,
          viewpagerHome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

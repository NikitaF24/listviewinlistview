// Generated by view binder compiler. Do not edit!
package com.example.listviewinlistview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.listviewinlistview.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityModifyWordBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnModify;

  @NonNull
  public final FloatingActionButton buttonBack3;

  @NonNull
  public final EditText editTextB;

  @NonNull
  public final EditText editTextC;

  private ActivityModifyWordBinding(@NonNull RelativeLayout rootView, @NonNull Button btnModify,
      @NonNull FloatingActionButton buttonBack3, @NonNull EditText editTextB,
      @NonNull EditText editTextC) {
    this.rootView = rootView;
    this.btnModify = btnModify;
    this.buttonBack3 = buttonBack3;
    this.editTextB = editTextB;
    this.editTextC = editTextC;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityModifyWordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityModifyWordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_modify_word, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityModifyWordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnModify;
      Button btnModify = ViewBindings.findChildViewById(rootView, id);
      if (btnModify == null) {
        break missingId;
      }

      id = R.id.buttonBack3;
      FloatingActionButton buttonBack3 = ViewBindings.findChildViewById(rootView, id);
      if (buttonBack3 == null) {
        break missingId;
      }

      id = R.id.editTextB;
      EditText editTextB = ViewBindings.findChildViewById(rootView, id);
      if (editTextB == null) {
        break missingId;
      }

      id = R.id.editTextC;
      EditText editTextC = ViewBindings.findChildViewById(rootView, id);
      if (editTextC == null) {
        break missingId;
      }

      return new ActivityModifyWordBinding((RelativeLayout) rootView, btnModify, buttonBack3,
          editTextB, editTextC);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

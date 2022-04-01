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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddWordBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnModify;

  @NonNull
  public final EditText editTextB;

  @NonNull
  public final EditText editTextC;

  private ActivityAddWordBinding(@NonNull RelativeLayout rootView, @NonNull Button btnModify,
      @NonNull EditText editTextB, @NonNull EditText editTextC) {
    this.rootView = rootView;
    this.btnModify = btnModify;
    this.editTextB = editTextB;
    this.editTextC = editTextC;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddWordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddWordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_word, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddWordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnModify;
      Button btnModify = ViewBindings.findChildViewById(rootView, id);
      if (btnModify == null) {
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

      return new ActivityAddWordBinding((RelativeLayout) rootView, btnModify, editTextB, editTextC);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

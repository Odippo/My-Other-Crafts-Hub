// Generated by view binder compiler. Do not edit!
package com.example.myproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myproject.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentCraftsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputLayout ReferralLayout;

  @NonNull
  public final TextInputEditText confirmPassEt;

  @NonNull
  public final TextInputLayout confirmPasswordLayout;

  @NonNull
  public final TextInputEditText passET;

  @NonNull
  public final TextInputLayout passwordLayout;

  @NonNull
  public final TextInputEditText referralEt;

  @NonNull
  public final AppCompatButton regButton;

  private ContentCraftsBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputLayout ReferralLayout, @NonNull TextInputEditText confirmPassEt,
      @NonNull TextInputLayout confirmPasswordLayout, @NonNull TextInputEditText passET,
      @NonNull TextInputLayout passwordLayout, @NonNull TextInputEditText referralEt,
      @NonNull AppCompatButton regButton) {
    this.rootView = rootView;
    this.ReferralLayout = ReferralLayout;
    this.confirmPassEt = confirmPassEt;
    this.confirmPasswordLayout = confirmPasswordLayout;
    this.passET = passET;
    this.passwordLayout = passwordLayout;
    this.referralEt = referralEt;
    this.regButton = regButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentCraftsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentCraftsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_crafts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentCraftsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ReferralLayout;
      TextInputLayout ReferralLayout = ViewBindings.findChildViewById(rootView, id);
      if (ReferralLayout == null) {
        break missingId;
      }

      id = R.id.confirmPassEt;
      TextInputEditText confirmPassEt = ViewBindings.findChildViewById(rootView, id);
      if (confirmPassEt == null) {
        break missingId;
      }

      id = R.id.confirmPasswordLayout;
      TextInputLayout confirmPasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (confirmPasswordLayout == null) {
        break missingId;
      }

      id = R.id.passET;
      TextInputEditText passET = ViewBindings.findChildViewById(rootView, id);
      if (passET == null) {
        break missingId;
      }

      id = R.id.passwordLayout;
      TextInputLayout passwordLayout = ViewBindings.findChildViewById(rootView, id);
      if (passwordLayout == null) {
        break missingId;
      }

      id = R.id.referralEt;
      TextInputEditText referralEt = ViewBindings.findChildViewById(rootView, id);
      if (referralEt == null) {
        break missingId;
      }

      id = R.id.regButton;
      AppCompatButton regButton = ViewBindings.findChildViewById(rootView, id);
      if (regButton == null) {
        break missingId;
      }

      return new ContentCraftsBinding((ConstraintLayout) rootView, ReferralLayout, confirmPassEt,
          confirmPasswordLayout, passET, passwordLayout, referralEt, regButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

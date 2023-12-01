// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView cover;

  @NonNull
  public final TextView subtitle1;

  @NonNull
  public final TextView subtitle2;

  @NonNull
  public final TextView title;

  private GridListItemBinding(@NonNull MaterialCardView rootView, @NonNull ImageView cover,
      @NonNull TextView subtitle1, @NonNull TextView subtitle2, @NonNull TextView title) {
    this.rootView = rootView;
    this.cover = cover;
    this.subtitle1 = subtitle1;
    this.subtitle2 = subtitle2;
    this.title = title;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cover;
      ImageView cover = ViewBindings.findChildViewById(rootView, id);
      if (cover == null) {
        break missingId;
      }

      id = R.id.subtitle1;
      TextView subtitle1 = ViewBindings.findChildViewById(rootView, id);
      if (subtitle1 == null) {
        break missingId;
      }

      id = R.id.subtitle2;
      TextView subtitle2 = ViewBindings.findChildViewById(rootView, id);
      if (subtitle2 == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, cover, subtitle1, subtitle2,
          title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

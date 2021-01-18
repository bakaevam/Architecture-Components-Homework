package com.epam.navigationproject.auth

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.epam.navigationproject.R
import com.epam.navigationproject.main.MainActivity
import com.epam.navigationproject.main.MainActivityArgs
import kotlinx.android.synthetic.main.fragment_create_profile.*

class CreateProfileFragment : Fragment(R.layout.fragment_create_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as? AppCompatActivity)?.supportActionBar?.title = "Create profile"

        val args = CreateProfileFragmentArgs.fromBundle(requireArguments())
        phoneNumber.setText(args.phoneNumber)

        button.setOnClickListener {
            val allArgs = MainActivityArgs(
                firstName =  firstName.editableText.toString(),
                lastName = lastName.editableText.toString(),
            phoneNumber = phoneNumber.editableText.toString()).toBundle()
            findNavController().navigate(R.id.action_createProfileFragment_to_mainActivity, allArgs)
        }
    }

}
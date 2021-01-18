package com.epam.navigationproject.auth

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.epam.navigationproject.R
import com.mukesh.OtpView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_sms_code_confirmation.*

class SmsCodeConfirmationFragment : Fragment(R.layout.fragment_sms_code_confirmation) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as? AppCompatActivity)?.supportActionBar?.title = "SMS code"

        val args = SmsCodeConfirmationFragmentArgs.fromBundle(requireArguments())

        phoneNumber.setText(args.phoneNumber)
        button.setOnClickListener {
            val phoneArgs: Bundle = CreateProfileFragmentArgs(phoneNumber = phoneNumber.editableText.toString()).toBundle()
            findNavController().navigate(R.id.action_smsCodeConfirmationFragment_to_createProfileFragment, phoneArgs)
        }
    }

}
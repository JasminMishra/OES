package com.oes.util;

import org.apache.catalina.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.oes.dto.UserDefaultResponseDTO;
import com.oes.dto.UserProductCreatedResponseDTO;
import com.oes.dto.UserReviewCreatedResponseDTO;
import com.oes.entity.Product;
import com.oes.entity.Review;

@Component
@Scope("singleton")
public class UserDTOConvertor {

	public static UserDefaultResponseDTO  getUserDefaultDTO(com.oes.entity.User user)
	{
		UserDefaultResponseDTO dto = new UserDefaultResponseDTO(
				                 user.getUsername(), 
				                 user.getUserId(), 
				                 user.getUserProfile().getEmail(),
				                 "User Profile Created , Profile Id : "+user.getUserProfile().getProfileId());
		
		return dto;
	}
	
	
	
	
	public static UserReviewCreatedResponseDTO getPostCreatedDTO(com.oes.entity.User user,Review review)
	{
		UserReviewCreatedResponseDTO dto = new UserReviewCreatedResponseDTO(
				 user.getUsername(), 
                 user.getUserId(), 
                 review.getDescription(),
                 "Review Added "+review.getDate()
                 );
				 
				 return dto;
	}
	public static UserProductCreatedResponseDTO getProductCreatedDTO(com.oes.entity.User user,Product product)
	{
		UserProductCreatedResponseDTO dto = new UserProductCreatedResponseDTO(
				 user.getUsername(), 
                 user.getUserId(), 
                 product.getBrandName(),
                 "Product Added "+product.getDateOfLaunch()
                 );
				 
				 return dto;
	}

}
package multi.second.project.domain.group.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import multi.second.project.domain.member.domain.Member;
import multi.second.project.domain.planner.domain.Planner;

@Entity
@DynamicInsert // insert 쿼리를 생성할 때 null인 필드는 쿼리에서 생략
@DynamicUpdate // entity에서 변경이 발견되지 않은 값은 쿼리에서 생략
@Builder @NoArgsConstructor @AllArgsConstructor @Getter
public class TravelGroup {
	
	@Id
	@GeneratedValue
	private Long tgIdx;
	
	@OneToMany
	private List<Member> members = new ArrayList<>();
	
	public void addMembers(Member member) {
		members.add(member);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

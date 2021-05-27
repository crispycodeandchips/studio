package org.keylime.mapper;

import java.util.List;

import org.keylime.domain.BoardVO;
import org.keylime.domain.Criteria;

public interface BoardMapper {
	
	//@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri); //검색의 기준(?)

	public void insert(BoardVO board);
	
	public Integer insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno); //DB를 읽는건가..
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	public int getTotalCount(Criteria cri);
}

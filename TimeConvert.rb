def TimeConvert(num)

  i=(num/60).floor
  j=num.modulo(60)

   # num=i.to_s+":"+j.to_s
   num="#{i}:#{j}"

    return num 

end

TimeConvert(STDIN.gets)  

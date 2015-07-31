def SimpleSymbols(str)

  arr = str.chars.to_a
  arr.each_index do |x|
    if(arr[x].match(/[a-zA-Z]/))
      if(x == 0 || x + 1 == arr.length ||
        arr[x - 1] != '+' || arr[x + 1] != '+')
        return "false"
      end
    end
  end
  
  return "true" 
         
end
# keep this function call here 
# to see how to enter arguments in Ruby scroll down   
SimpleSymbols(STDIN.gets)  
